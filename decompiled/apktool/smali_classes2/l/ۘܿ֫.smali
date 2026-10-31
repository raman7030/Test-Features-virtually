.class public final Ll/ۘܿ֫;
.super Landroid/text/Editable$Factory;
.source "7B0L"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static volatile ۧ:Landroid/text/Editable$Factory;

.field public static ܽ:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۘܿ֫;->֫:Ljava/lang/Object;

    return-void
.end method

.method public static getInstance()Landroid/text/Editable$Factory;
    .locals 5

    .line 62
    sget-object v0, Ll/ۘܿ֫;->ۧ:Landroid/text/Editable$Factory;

    if-nez v0, :cond_1

    .line 63
    sget-object v0, Ll/ۘܿ֫;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 64
    :try_start_0
    sget-object v1, Ll/ۘܿ֫;->ۧ:Landroid/text/Editable$Factory;

    if-nez v1, :cond_0

    .line 65
    new-instance v1, Ll/ۘܿ֫;

    .line 51
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 54
    const-class v3, Ll/ۘܿ֫;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Ll/ۘܿ֫;->ܽ:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :catchall_0
    :try_start_2
    sput-object v1, Ll/ۘܿ֫;->ۧ:Landroid/text/Editable$Factory;

    .line 67
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    .line 69
    :cond_1
    :goto_0
    sget-object v0, Ll/ۘܿ֫;->ۧ:Landroid/text/Editable$Factory;

    return-object v0
.end method


# virtual methods
.method public final newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;
    .locals 1

    .line 74
    sget-object v0, Ll/ۘܿ֫;->ܽ:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 75
    invoke-static {v0, p1}, Ll/۟ᩳ֫;->֫(Ljava/lang/Class;Ljava/lang/CharSequence;)Ll/۟ᩳ֫;

    move-result-object p1

    return-object p1

    .line 77
    :cond_0
    invoke-super {p0, p1}, Landroid/text/Editable$Factory;->newEditable(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object p1

    return-object p1
.end method
