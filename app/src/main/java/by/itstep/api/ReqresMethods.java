package by.itstep.api;

import by.itstep.model.UsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ReqresMethods {

    @GET("users")
    Call<UsersResponse> getUsers();

}
