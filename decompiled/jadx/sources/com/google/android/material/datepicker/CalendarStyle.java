package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import l.C17931;
import l.C19343;

/* JADX INFO: loaded from: classes.dex */
public final class CalendarStyle {
    public final CalendarItemStyle day;
    public final CalendarItemStyle invalidDay;
    public final Paint rangeFill;
    public final CalendarItemStyle selectedDay;
    public final CalendarItemStyle selectedYear;
    public final CalendarItemStyle todayDay;
    public final CalendarItemStyle todayYear;
    public final CalendarItemStyle year;

    public CalendarStyle(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C17931.f55732, MaterialCalendar.class.getCanonicalName()), C19343.f61818);
        this.day = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f62393, 0));
        this.invalidDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f62605, 0));
        this.selectedDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61328, 0));
        this.todayDay = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61540, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C19343.f62019);
        this.year = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61116, 0));
        this.selectedYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f61010, 0));
        this.todayYear = CalendarItemStyle.create(context, typedArrayObtainStyledAttributes.getResourceId(C19343.f62234, 0));
        Paint paint = new Paint();
        this.rangeFill = paint;
        paint.setColor(colorStateList.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
