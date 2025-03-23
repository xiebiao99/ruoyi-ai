//package org.ruoyi.common.chat.localModels;
//
//import com.cyy.chat.model.parama.EmbeddingsApiParam;
//import com.cyy.chat.model.result.EmbeddingsApiResult;
//import com.google.gson.Gson;
//import okhttp3.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//
///**
// * @author CYY
// * @date 2023年03月11日 下午9:00
// * @description
// */
//@Component
//public class EmbeddingModel {
//    @Autowired
//    private OkHttpClient openAiHttpClient;
//    private EmbeddingsApiParam embeddingsApiParam = new EmbeddingsApiParam();
//
//    private static final String API_URL = "http://192.168.254.30:6008/v1/embeddings";
//    private static final String API_KEY = "sk-aaabbbcccdddeeefffggghhhiiijjjkkk"; // 你的 Bearer Token
//
//
//    /**
//     * 请求获取Embeddings，请求出错返回null
//     * @param apiKey openAIKey
//     * @param msg 需要Embeddings的信息
//     * @return 为null则请求失败，反之放回正确结果
//     */
//    public EmbeddingsApiResult doEmbedding(String apiKey, String msg){
//        this.embeddingsApiParam.setInput(msg);
//        Gson gson = new Gson();
//        String json = gson.toJson(this.embeddingsApiParam);
//        String input = "{\n" +
//                "    \"model\":\"m3e\",\n" +
//                "    \"input\":[\"邮电人才是什么\"]\n" +
//                "}";
//        RequestBody requestBody = RequestBody.create(input, MediaType.get("application/json; charset=utf-8"));
//        Request request = new Request.Builder()
////                .url("https://api.openai.com/v1/embeddings")
//                .url("http://172.26.144.1:6008/v1/embeddings")
//                .addHeader("Content-Type","application/json")
////                .addHeader("Authorization", apiKey)
//                .post(requestBody).build();
//        EmbeddingsApiResult embeddingsApiResult = null;
//        try(Response response = openAiHttpClient.newCall(request).execute()){
//            if(response.code() == 200){
//                embeddingsApiResult = gson.fromJson(response.body().string(), EmbeddingsApiResult.class);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return embeddingsApiResult;
//    }
//
//    public EmbeddingsApiResult callEmbeddingsApi(String input) throws IOException {
//        // 创建请求体
//        RequestBody requestBody = RequestBody.create(input, MediaType.get("application/json; charset=utf-8"));
//
//        // 构建请求
//        Request request = new Request.Builder()
//                .url(API_URL)
//                .addHeader("Content-Type", "application/json")
//                .addHeader("Authorization", "Bearer " + API_KEY) // 添加 Bearer Token
//                .post(requestBody)
//                .build();
//
//        // 发起请求并处理响应
//        EmbeddingsApiResult embeddingsApiResult = null;
//        try (Response response = openAiHttpClient.newCall(request).execute()) {
//            if (response.isSuccessful()) { // 使用 isSuccessful() 检查状态码是否在 200..300 范围内
//                embeddingsApiResult = new Gson().fromJson(response.body().string(), EmbeddingsApiResult.class);
//            } else {
//                // 如果请求失败，可以在这里处理错误
//                System.err.println("Failed to get response. HTTP Code: " + response.code());
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return embeddingsApiResult;
//    }
//
//}
