package madeinweb.com.br.estudoapi2;

import java.util.List;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;

public class GithubAPI {

    String ENDPOINT = "https://api.github.com";

    @GET("user/repo?per_page=100")
    Single<List<GithubRepo>> getRepos();

    @GET("/repos/{owner}/{repo}/issues")
    Single<List<GithubIssue>>
    getIssues(
            @Path("ownew")
                    String owner,
            @Path("repo") String repository);
    @POST
    Single<ResponseBody> postComment(
            @Url String url, @Body GithubIssue issue);
}
