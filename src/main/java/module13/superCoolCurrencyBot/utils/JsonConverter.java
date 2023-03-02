package module13.superCoolCurrencyBot.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

public class JsonConverter {
  private JsonConverter() {
  }

  public static <T> List<T> convertResponseToList(String response, Class<T> typeListElementClass) {
    Type type = TypeToken.getParameterized(List.class, typeListElementClass).getType();
    Gson gson = new Gson();
    return gson.fromJson(response, type);
  }
}
