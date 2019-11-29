package sepehr.project.com.androidoreoserviceexample.di.app

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import sepehr.project.com.androidoreoserviceexample.BaseApplication
import sepehr.project.com.androidoreoserviceexample.di.scopes.AppScope
import sepehr.project.com.androidoreoserviceexample.di.utils.ActivityBuildersModule
import sepehr.project.com.androidoreoserviceexample.di.utils.view_model.ViewModelFactoryModule

@AppScope
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBuildersModule::class,
        ViewModelFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun baseApplication(baseApplication: BaseApplication): Builder

        fun build(): AppComponent
    }
}