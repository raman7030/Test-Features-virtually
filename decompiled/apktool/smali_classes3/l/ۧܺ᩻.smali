.class public final Ll/ۧܺ᩻;
.super Ljava/io/OutputStream;
.source "L7F9"


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public final ᩶:Ljava/net/Socket;

.field public ᩸:Z

.field public final ᩹:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>(Ljava/net/Socket;Ljava/io/OutputStream;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ۧܺ᩻;->᩶:Ljava/net/Socket;

    .line 26
    iput-object p2, p0, Ll/ۧܺ᩻;->᩹:Ljava/io/OutputStream;

    return-void
.end method

.method private ܽ()Z
    .locals 7

    .line 145
    iget-object v0, p0, Ll/ۧܺ᩻;->᩶:Ljava/net/Socket;

    :try_start_0
    const-string v1, "engine"

    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_2

    :goto_0
    if-eqz v2, :cond_1

    .line 174
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v2, 0x1

    .line 163
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string v4, "closeOutbound"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    .line 147
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const-string v6, "drainOutgoingQueue"
    :try_end_2
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_1
    if-eqz v4, :cond_0

    .line 189
    :try_start_3
    invoke-virtual {v4, v6, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_3 .. :try_end_3} :catch_2

    .line 149
    :try_start_4
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 150
    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    invoke-virtual {v3, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return v2

    .line 191
    :catch_0
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_1

    .line 194
    :cond_0
    new-instance v0, Ljava/lang/NoSuchMethodException;

    invoke-direct {v0, v6}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 176
    :catch_1
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 179
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 86
    :try_start_0
    iget-boolean v1, p0, Ll/ۧܺ᩻;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 87
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 89
    :try_start_1
    iput-boolean v1, p0, Ll/ۧܺ᩻;->᩸:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :try_start_2
    iget-object v2, p0, Ll/ۧܺ᩻;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x0

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_0
    if-nez v2, :cond_3

    .line 98
    :try_start_3
    invoke-direct {p0}, Ll/ۧܺ᩻;->ܽ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 99
    iput-boolean v1, p0, Ll/ۧܺ᩻;->ۙ:Z

    goto :goto_1

    .line 132
    :cond_1
    iget-boolean v3, p0, Ll/ۧܺ᩻;->ۗ:Z

    if-eqz v3, :cond_2

    goto :goto_1

    .line 135
    :cond_2
    iput-boolean v1, p0, Ll/ۧܺ᩻;->ۗ:Z

    .line 136
    iget-object v1, p0, Ll/ۧܺ᩻;->᩶:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_1
    move-exception v1

    move-object v2, v1

    goto :goto_1

    .line 132
    :cond_3
    :try_start_4
    iget-boolean v3, p0, Ll/ۧܺ᩻;->ۗ:Z

    if-eqz v3, :cond_4

    goto :goto_1

    .line 135
    :cond_4
    iput-boolean v1, p0, Ll/ۧܺ᩻;->ۗ:Z

    .line 136
    iget-object v1, p0, Ll/ۧܺ᩻;->᩶:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1

    :catch_2
    move-exception v1

    .line 110
    :try_start_5
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_1
    if-nez v2, :cond_5

    .line 116
    monitor-exit v0

    return-void

    .line 114
    :cond_5
    :try_start_6
    throw v2

    :catchall_0
    move-exception v1

    .line 116
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method

.method public final flush()V
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۧܺ᩻;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۧܺ᩻;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 42
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۧܺ᩻;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_2

    if-ltz p3, :cond_2

    .line 54
    array-length v0, p1

    if-gt p2, v0, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-gt p3, v0, :cond_2

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    if-lez p3, :cond_1

    const/16 v0, 0x4000

    .line 63
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 66
    iget-object v1, p0, Ll/ۧܺ᩻;->᩹:Ljava/io/OutputStream;

    invoke-virtual {v1, p1, p2, v0}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 122
    :try_start_0
    iget-boolean v1, p0, Ll/ۧܺ᩻;->ۙ:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 123
    iput-boolean v1, p0, Ll/ۧܺ᩻;->ۙ:Z

    .line 132
    iget-boolean v1, p0, Ll/ۧܺ᩻;->ۗ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 135
    iput-boolean v1, p0, Ll/ۧܺ᩻;->ۗ:Z

    .line 136
    iget-object v1, p0, Ll/ۧܺ᩻;->᩶:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
