.class public final Ll/᩺᩻;
.super Ljava/lang/Object;
.source "Y55F"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# static fields
.field public static final ᩶:[Ljava/lang/Class;


# instance fields
.field public ᩸:Ljava/lang/reflect/Method;

.field public ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    .line 258
    const-class v1, Landroid/view/MenuItem;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Ll/᩺᩻;->᩶:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 264
    iput-object p1, p0, Ll/᩺᩻;->᩹:Ljava/lang/Object;

    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 267
    :try_start_0
    sget-object v0, Ll/᩺᩻;->᩶:[Ljava/lang/Class;

    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Ll/᩺᩻;->᩸:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 269
    new-instance v1, Landroid/view/InflateException;

    const-string v2, "Couldn\'t resolve menu item onClick handler "

    const-string v3, " in class "

    .line 0
    invoke-static {v2, p2, v3}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 271
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    .line 272
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 273
    throw v1
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    .line 280
    iget-object v0, p0, Ll/᩺᩻;->᩸:Ljava/lang/reflect/Method;

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Ll/᩺᩻;->᩹:Ljava/lang/Object;

    if-ne v1, v2, :cond_0

    :try_start_1
    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    .line 281
    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    new-array v1, v4, [Ljava/lang/Object;

    aput-object p1, v1, v3

    .line 283
    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return v4

    :catch_0
    move-exception p1

    .line 287
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
