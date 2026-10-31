.class public final Ll/᩸ۚۢ;
.super Ljava/lang/Object;
.source "Z1XI"


# static fields
.field public static ۧ:Ljava/lang/ref/WeakReference;


# instance fields
.field public final ֫:Landroid/widget/Toast;


# direct methods
.method public constructor <init>(Landroid/widget/Toast;)V
    .locals 3

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/᩸ۚۢ;->֫:Landroid/widget/Toast;

    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    .line 34
    :try_start_0
    const-class v0, Landroid/widget/Toast;

    const-string v1, "mTN"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 36
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "mHandler"

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Handler;

    .line 40
    new-instance v2, Ll/ܶۚۢ;

    invoke-direct {v2, v1}, Ll/ܶۚۢ;-><init>(Landroid/os/Handler;)V

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ֫(I)Ll/᩸ۚۢ;
    .locals 1

    const/4 v0, 0x0

    .line 79
    invoke-static {p0, v0}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    .line 80
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-object p0
.end method

.method public static ֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;
    .locals 2

    .line 116
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1, p0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 117
    invoke-virtual {v0, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 119
    :catch_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p1, p0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 121
    :goto_0
    new-instance p0, Ll/᩸ۚۢ;

    invoke-direct {p0, v0}, Ll/᩸ۚۢ;-><init>(Landroid/widget/Toast;)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-static {v0, p0}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)V
    .locals 5

    const-string v0, "\\w"

    .line 70
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 72
    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x28

    if-le v2, v0, :cond_1

    goto :goto_2

    :cond_1
    const-string v2, "[\\u4e00-\\u9fa5]"

    .line 70
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const/4 v3, 0x0

    .line 72
    :goto_1
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-le v3, v0, :cond_3

    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x3c

    if-le v0, v2, :cond_4

    :goto_2
    const/4 v1, 0x1

    .line 64
    :cond_4
    invoke-static {v1, p0}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸ۚۢ;)V
    .locals 1

    .line 153
    iget-object p0, p0, Ll/᩸ۚۢ;->֫:Landroid/widget/Toast;

    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 155
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 156
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/᩸ۚۢ;->ۧ:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static ۧ(II)Ll/᩸ۚۢ;
    .locals 2

    .line 128
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    .line 129
    invoke-virtual {v0, p0}, Landroid/widget/Toast;->setText(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 131
    :catch_0
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 133
    :goto_0
    new-instance p0, Ll/᩸ۚۢ;

    invoke-direct {p0, v0}, Ll/᩸ۚۢ;-><init>(Landroid/widget/Toast;)V

    return-object p0
.end method

.method public static ۧ(I)V
    .locals 1

    const/4 v0, 0x1

    .line 91
    invoke-static {p0, v0}, Ll/᩸ۚۢ;->ۧ(II)Ll/᩸ۚۢ;

    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method

.method public static ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x1

    .line 85
    invoke-static {v0, p0}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p0

    .line 86
    invoke-virtual {p0}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method

.method public static ܽ()V
    .locals 2

    .line 138
    sget-object v0, Ll/᩸ۚۢ;->ۧ:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Toast;

    .line 140
    sput-object v1, Ll/᩸ۚۢ;->ۧ:Ljava/lang/ref/WeakReference;

    move-object v1, v0

    :cond_0
    if-eqz v1, :cond_1

    .line 144
    :try_start_0
    invoke-virtual {v1}, Landroid/widget/Toast;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 174
    :try_start_0
    iget-object v0, p0, Ll/᩸ۚۢ;->֫:Landroid/widget/Toast;

    invoke-virtual {v0}, Landroid/widget/Toast;->cancel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final ֫(II)V
    .locals 2

    const/4 v0, 0x0

    .line 169
    iget-object v1, p0, Ll/᩸ۚۢ;->֫:Landroid/widget/Toast;

    invoke-virtual {v1, p1, v0, p2}, Landroid/widget/Toast;->setGravity(III)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 152
    new-instance v0, Ll/۠ۚۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/۠ۚۢ;-><init>(ILjava/lang/Object;)V

    .line 161
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-ne v1, v2, :cond_0

    .line 162
    invoke-virtual {v0}, Ll/۠ۚۢ;->run()V

    return-void

    .line 164
    :cond_0
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
