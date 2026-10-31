.class public final Ll/ܶۛ;
.super Ljava/lang/Object;
.source "C23A"


# static fields
.field public static ֫:Z

.field public static ۧ:Ljava/lang/reflect/Method;

.field public static ܽ:Z

.field public static ᩳ:Ljava/lang/reflect/Field;


# direct methods
.method public static ֫(Landroid/view/View;Landroid/view/KeyEvent;)Z
    .locals 2

    .line 63
    sget v0, Ll/ܿ᩺;->֫:I

    .line 4562
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 4565
    :cond_0
    sget v0, Ll/ᩳ᩺;->ᩳ:I

    const v0, 0x7f0a05b4

    .line 5014
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩺;

    if-nez v1, :cond_1

    .line 5016
    new-instance v1, Ll/ᩳ᩺;

    invoke-direct {v1}, Ll/ᩳ᩺;-><init>()V

    .line 5017
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4565
    :cond_1
    invoke-virtual {v1, p1}, Ll/ᩳ᩺;->֫(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static ֫(Ll/۠ۛ;Landroid/view/View;Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z
    .locals 9

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_8

    .line 84
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_1

    .line 85
    invoke-interface {p0, p3}, Ll/۠ۛ;->֫(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0

    .line 87
    :cond_1
    instance-of v3, p2, Landroid/app/Activity;

    const v4, 0x7f0a05b4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_b

    .line 88
    check-cast p2, Landroid/app/Activity;

    .line 120
    invoke-virtual {p2}, Landroid/app/Activity;->onUserInteraction()V

    .line 122
    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/16 p1, 0x8

    .line 126
    invoke-virtual {p0, p1}, Landroid/view/Window;->hasFeature(I)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 127
    invoke-virtual {p2}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object p1

    .line 128
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v3, 0x52

    if-ne v1, v3, :cond_5

    if-eqz p1, :cond_5

    .line 97
    sget-boolean v1, Ll/ܶۛ;->֫:Z

    if-nez v1, :cond_2

    .line 100
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v3, "onMenuKeyEvent"

    new-array v7, v6, [Ljava/lang/Class;

    const-class v8, Landroid/view/KeyEvent;

    aput-object v8, v7, v0

    invoke-virtual {v1, v3, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Ll/ܶۛ;->ۧ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :catch_0
    sput-boolean v6, Ll/ܶۛ;->֫:Z

    .line 105
    :cond_2
    sget-object v1, Ll/ܶۛ;->ۧ:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_4

    :try_start_1
    new-array v3, v6, [Ljava/lang/Object;

    aput-object p3, v3, v0

    .line 107
    invoke-virtual {v1, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 111
    :cond_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    :cond_4
    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_5

    goto :goto_3

    .line 135
    :cond_5
    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_3

    .line 138
    :cond_6
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    .line 139
    sget p1, Ll/ܿ᩺;->֫:I

    .line 4570
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v2, :cond_7

    goto :goto_2

    .line 4573
    :cond_7
    sget p1, Ll/ᩳ᩺;->ᩳ:I

    .line 5014
    invoke-virtual {p0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩺;

    if-nez p1, :cond_8

    .line 5016
    new-instance p1, Ll/ᩳ᩺;

    invoke-direct {p1}, Ll/ᩳ᩺;-><init>()V

    .line 5017
    invoke-virtual {p0, v4, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4573
    :cond_8
    invoke-virtual {p1, p0, p3}, Ll/ᩳ᩺;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_2
    if-eqz v0, :cond_9

    goto :goto_3

    :cond_9
    if-eqz p0, :cond_a

    .line 143
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v5

    .line 142
    :cond_a
    invoke-virtual {p3, p2, v5, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    return v6

    .line 89
    :cond_b
    instance-of v3, p2, Landroid/app/Dialog;

    if-eqz v3, :cond_14

    .line 90
    check-cast p2, Landroid/app/Dialog;

    .line 148
    sget-boolean p0, Ll/ܶۛ;->ܽ:Z

    if-nez p0, :cond_c

    .line 150
    :try_start_2
    const-class p0, Landroid/app/Dialog;

    const-string p1, "mOnKeyListener"

    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0

    sput-object p0, Ll/ܶۛ;->ᩳ:Ljava/lang/reflect/Field;

    .line 151
    invoke-virtual {p0, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2

    .line 154
    :catch_2
    sput-boolean v6, Ll/ܶۛ;->ܽ:Z

    .line 157
    :cond_c
    sget-object p0, Ll/ܶۛ;->ᩳ:Ljava/lang/reflect/Field;

    if-eqz p0, :cond_d

    .line 159
    :try_start_3
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/DialogInterface$OnKeyListener;
    :try_end_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_4

    :catch_3
    :cond_d
    move-object p0, v5

    :goto_4
    if-eqz p0, :cond_e

    .line 168
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-interface {p0, p2, p1, p3}, Landroid/content/DialogInterface$OnKeyListener;->onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_e

    goto :goto_6

    .line 171
    :cond_e
    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    .line 172
    invoke-virtual {p0, p3}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto :goto_6

    .line 175
    :cond_f
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    .line 176
    sget p1, Ll/ܿ᩺;->֫:I

    .line 4570
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v2, :cond_10

    goto :goto_5

    .line 4573
    :cond_10
    sget p1, Ll/ᩳ᩺;->ᩳ:I

    .line 5014
    invoke-virtual {p0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ᩺;

    if-nez p1, :cond_11

    .line 5016
    new-instance p1, Ll/ᩳ᩺;

    invoke-direct {p1}, Ll/ᩳ᩺;-><init>()V

    .line 5017
    invoke-virtual {p0, v4, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4573
    :cond_11
    invoke-virtual {p1, p0, p3}, Ll/ᩳ᩺;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    :goto_5
    if-eqz v0, :cond_12

    goto :goto_6

    :cond_12
    if-eqz p0, :cond_13

    .line 180
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v5

    .line 179
    :cond_13
    invoke-virtual {p3, p2, v5, p2}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    move-result v6

    :goto_6
    return v6

    :cond_14
    if-eqz p1, :cond_17

    .line 92
    sget p2, Ll/ܿ᩺;->֫:I

    if-lt v1, v2, :cond_15

    const/4 p1, 0x0

    goto :goto_7

    .line 4573
    :cond_15
    sget p2, Ll/ᩳ᩺;->ᩳ:I

    .line 5014
    invoke-virtual {p1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳ᩺;

    if-nez p2, :cond_16

    .line 5016
    new-instance p2, Ll/ᩳ᩺;

    invoke-direct {p2}, Ll/ᩳ᩺;-><init>()V

    .line 5017
    invoke-virtual {p1, v4, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4573
    :cond_16
    invoke-virtual {p2, p1, p3}, Ll/ᩳ᩺;->֫(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result p1

    :goto_7
    if-nez p1, :cond_18

    .line 93
    :cond_17
    invoke-interface {p0, p3}, Ll/۠ۛ;->֫(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_19

    :cond_18
    return v6

    :cond_19
    :goto_8
    return v0
.end method
