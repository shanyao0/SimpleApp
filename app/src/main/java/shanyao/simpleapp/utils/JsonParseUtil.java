package shanyao.simpleapp.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;

import com.alibaba.fastjson.JSON;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zs:
 */
public class JsonParseUtil {
	/**
	 * 获取json中某一个字段
	 * 
	 * @param json
	 * @param key
	 * @return
	 */
	public static String getString(String json, String key) {
		String result = null;
		try {
			result = JSON.parseObject(json).getString(key);
		} catch (Exception e) {
		}
		return result;
	}
	public static String getJson(Object object) {
		String result = null;
		try {
			result = JSON.toJSONString(object);
		} catch (Exception e) {
		}
		return result;
	}

	public static int getInt(String json, String key, int def) {
		int result = def;
		try {
			result = JSON.parseObject(json).getIntValue(key);
		} catch (Exception e) {
		}
		return result;
	}

	public static boolean getBoolean(String json, String key, boolean def) {
		boolean result = def;
		try {
			result = JSON.parseObject(json).getBooleanValue(key);
		} catch (Exception e) {
		}
		return result;
	}

	/**
	 * 把json解析成实体类
	 * 
	 * @param json
	 * @param c
	 * @return
	 */
	public static <T> T getBean(String json, Class<T> c) {
		T t = null;
		try {
			t = JSON.parseObject(json, c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}

	/**
	 * @param json
	 *            get from data
	 * @param c
	 * @return a list may be null
	 */
	public static <T> List<T> getArray(String json, Class<T> c) {
		List<T> list = new ArrayList<T>();
		try {
			list = JSON.parseArray(json, c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * <li>1. 判断返回的字串是否为空 <li>2.
	 * <li>3. 按照类型解析
	 * 
	 * @param json
	 * @param c
	 * @return
	 */
	public static <T> T parseBean(String json, Class<T> c) {
		T t = null;
		if (TextUtils.isEmpty(json)) {
			return t;
		}
		try {
			t = JSON.parseObject(json, c);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return t;
	}

	/**
	 * 字串解析数字
	 * 
	 * @param num
	 * @return
	 */
	public static int getNumFromString(String num) {
		int i = 0;
		try {
			i = Integer.parseInt(num);
		} catch (NumberFormatException e) {
		}
		return i;
	}

	public static int getNumFromString(String num, int def) {
		int i = def;
		try {
			i = Integer.parseInt(num);
		} catch (NumberFormatException e) {
		}
		return i;
	}

	public static String getJsonFromAssets(String fileName, Context context) {
		String json = null;
		AssetManager manager = context.getAssets();
		ByteArrayOutputStream bos = null;
		InputStream is = null;
		try {
			is = manager.open(fileName);
			bos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int read = -1;
			while ((read = is.read(buffer)) != -1) {
				bos.write(buffer, 0, read);
			}
			json = new String(bos.toByteArray(), "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return json;
	}

}
