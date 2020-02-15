package by.itstep.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ReqresApi {

    private static final ReqresMethods INSTANCE;

    private ReqresApi() {
    }

    static {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        INSTANCE = retrofit.create(ReqresMethods.class);
    }

    public static ReqresMethods getInstance() {
        return INSTANCE;
    }

}
