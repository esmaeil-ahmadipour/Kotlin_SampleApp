package ir.ea2.kotlin_sampleapp.util

import android.content.Context
import ir.ea2.kotlin_sampleapp.R
import ir.ea2.kotlin_sampleapp.R.*
import ir.ea2.kotlin_sampleapp.model.Category
import ir.ea2.kotlin_sampleapp.model.User

fun getUsers(context: Context):List<User>{
    val users:List<User> = listOf(
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman))),
        User("John", 7, context.resources.getString(string.image_man), Category(context.resources.getString(R.string.man))),
        User("Jeniffer", 19, context.resources.getString(string.image_woman), Category(context.resources.getString(R.string.woman)))
        )
    return users
}