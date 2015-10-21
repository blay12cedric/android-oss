package com.kickstarter.libs.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Patterns;

import com.kickstarter.R;

public class StringUtils {
  private StringUtils() {}

  public static boolean isEmail(@NonNull final CharSequence str) {
    return Patterns.EMAIL_ADDRESS.matcher(str).matches();
  }

  public static String friendBackingActivityTitle(@NonNull final Context context, @NonNull final String friendName,
    final long categoryId) {
    final String str;

    switch ((int) categoryId) {
      case 1: str = context.getString(R.string.friend_name_backed_art_project, friendName); break;
      case 3: str = context.getString(R.string.friend_name_backed_comics_project, friendName); break;
      case 26: str = context.getString(R.string.friend_name_backed_crafts_project, friendName); break;
      case 6: str = context.getString(R.string.friend_name_backed_dance_project, friendName); break;
      case 7: str = context.getString(R.string.friend_name_backed_design_project, friendName); break;
      case 9: str = context.getString(R.string.friend_name_backed_fashion_project, friendName); break;
      case 11: str = context.getString(R.string.friend_name_backed_film_project, friendName); break;
      case 10: str = context.getString(R.string.friend_name_backed_food_project, friendName); break;
      case 12: str = context.getString(R.string.friend_name_backed_games_project, friendName); break;
      case 13: str = context.getString(R.string.friend_name_backed_journalism_project, friendName); break;
      case 14: str = context.getString(R.string.friend_name_backed_music_project, friendName); break;
      case 15: str = context.getString(R.string.friend_name_backed_photography_project, friendName); break;
      case 18: str = context.getString(R.string.friend_name_backed_publishing_project, friendName); break;
      case 16: str = context.getString(R.string.friend_name_backed_technology_project, friendName); break;
      case 17: str = context.getString(R.string.friend_name_backed_theater_project, friendName); break;
      default: str = "";
    }

    return str;
  }
}