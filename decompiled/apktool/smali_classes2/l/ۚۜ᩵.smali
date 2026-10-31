.class public final Ll/ۚۜ᩵;
.super Ljava/lang/Object;
.source "G6PO"


# static fields
.field public static final ֫:J

.field public static final ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final ۧ:J

.field public static final ܳ:Lsun/misc/Unsafe;

.field public static final ܽ:J

.field public static final ܿ:J

.field public static final ᩳ:Z

.field public static final ᩷:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final ᩻:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    .line 214
    const-class v0, Ljava/lang/Thread;

    sget-object v1, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v1, Ll/ۚۜ᩵;->ܳ:Lsun/misc/Unsafe;

    :try_start_0
    const-string v2, "com.ibm.misc.JarVersion"

    .line 189
    invoke-static {v2}, Ll/ۚۜ᩵;->֫(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    const-string v2, "java.class.version"

    const-string v5, "45"

    .line 190
    invoke-static {v2, v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 191
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x2

    if-lt v5, v6, :cond_0

    .line 192
    invoke-virtual {v2, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v5, "52"

    .line 193
    invoke-virtual {v5, v2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v5, "android.util.DisplayMetrics"

    .line 175
    invoke-static {v5}, Ll/ۚۜ᩵;->֫(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const-string v5, "org.robovm.rt.bro.Bro"

    .line 180
    invoke-static {v5}, Ll/ۚۜ᩵;->֫(Ljava/lang/String;)Z

    move-result v5

    .line 224
    :goto_1
    sput-boolean v5, Ll/ۚۜ᩵;->ᩳ:Z

    if-nez v5, :cond_3

    const-string v5, "threadLocals"

    .line 227
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 226
    invoke-virtual {v1, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    sput-wide v5, Ll/ۚۜ᩵;->ܿ:J

    const-string v5, "inheritableThreadLocals"

    .line 229
    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    .line 228
    invoke-virtual {v1, v5}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    sput-wide v5, Ll/ۚۜ᩵;->ۧ:J

    if-eqz v2, :cond_2

    const-string v2, "accessControlContext"

    goto :goto_2

    :cond_2
    const-string v2, "inheritedAccessControlContext"

    .line 234
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 233
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v5

    sput-wide v5, Ll/ۚۜ᩵;->ܽ:J

    const-string v2, "contextClassLoader"

    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 235
    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ll/ۚۜ᩵;->֫:J

    goto :goto_3

    :cond_3
    const-wide/16 v0, 0x0

    .line 239
    sput-wide v0, Ll/ۚۜ᩵;->ܿ:J

    .line 240
    sput-wide v0, Ll/ۚۜ᩵;->ۧ:J

    .line 241
    sput-wide v0, Ll/ۚۜ᩵;->ܽ:J

    .line 242
    sput-wide v0, Ll/ۚۜ᩵;->֫:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 249
    :goto_3
    new-instance v0, Ll/ᩴۜ᩵;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۚۜ᩵;->᩻:Ljava/lang/ThreadLocal;

    .line 257
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/ۚۜ᩵;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 262
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 263
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const/16 v5, 0x21

    ushr-long v6, v1, v5

    xor-long/2addr v1, v6

    const-wide v6, -0xae502812aa7333L

    mul-long v1, v1, v6

    ushr-long v8, v1, v5

    xor-long/2addr v1, v8

    const-wide v8, -0x3b314601e57a13adL    # -2.902039044684214E23

    mul-long v1, v1, v8

    ushr-long v10, v1, v5

    xor-long/2addr v1, v10

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    ushr-long v12, v10, v5

    xor-long/2addr v10, v12

    mul-long v10, v10, v6

    ushr-long v6, v10, v5

    xor-long/2addr v6, v10

    mul-long v6, v6, v8

    ushr-long v8, v6, v5

    xor-long v5, v6, v8

    xor-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Ll/ۚۜ᩵;->᩷:Ljava/util/concurrent/atomic/AtomicLong;

    .line 267
    new-instance v0, Ll/᩵ۜ᩵;

    .line 268
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 267
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x8

    .line 274
    invoke-static {v0}, Ljava/security/SecureRandom;->getSeed(I)[B

    move-result-object v1

    .line 275
    aget-byte v2, v1, v3

    int-to-long v2, v2

    const-wide/16 v5, 0xff

    and-long/2addr v2, v5

    :goto_4
    if-ge v4, v0, :cond_4

    shl-long/2addr v2, v0

    .line 277
    aget-byte v7, v1, v4

    int-to-long v7, v7

    and-long/2addr v7, v5

    or-long/2addr v2, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 279
    :cond_4
    sget-object v0, Ll/ۚۜ᩵;->᩷:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    :cond_5
    return-void

    :catch_0
    move-exception v0

    .line 245
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ֫()I
    .locals 1

    .line 118
    sget-object v0, Ll/ۚۜ᩵;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۜ᩵;

    iget v0, v0, Ll/֡ۜ᩵;->֫:I

    return v0
.end method

.method public static final ֫(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0xd

    xor-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x11

    xor-int/2addr p0, v0

    shl-int/lit8 v0, p0, 0x5

    xor-int/2addr p0, v0

    .line 122
    sget-object v0, Ll/ۚۜ᩵;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۜ᩵;

    iput p0, v0, Ll/֡ۜ᩵;->֫:I

    return p0
.end method

.method public static final ֫(Ljava/lang/Thread;)V
    .locals 4

    .line 140
    sget-boolean v0, Ll/ۚۜ᩵;->ᩳ:Z

    if-nez v0, :cond_0

    .line 141
    sget-object v0, Ll/ۚۜ᩵;->ܳ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۚۜ᩵;->ܿ:J

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 142
    sget-wide v1, Ll/ۚۜ᩵;->ۧ:J

    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final ֫(Ljava/lang/Thread;Ljava/lang/ClassLoader;)V
    .locals 3

    .line 154
    sget-boolean v0, Ll/ۚۜ᩵;->ᩳ:Z

    if-nez v0, :cond_0

    .line 155
    sget-object v0, Ll/ۚۜ᩵;->ܳ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۚۜ᩵;->֫:J

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final ֫(Ljava/lang/Thread;Ljava/security/AccessControlContext;)V
    .locals 3

    .line 148
    sget-boolean v0, Ll/ۚۜ᩵;->ᩳ:Z

    if-nez v0, :cond_0

    .line 149
    sget-object v0, Ll/ۚۜ᩵;->ܳ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۚۜ᩵;->ܽ:J

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putOrderedObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    .line 206
    :try_start_0
    const-class v1, Ll/ۚۜ᩵;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {p0, v0, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method public static final ۧ()V
    .locals 2

    .line 51
    sget-object v0, Ll/ۚۜ᩵;->ۜ:Ljava/util/concurrent/atomic/AtomicInteger;

    const v1, -0x61c88647

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 122
    :cond_0
    sget-object v1, Ll/ۚۜ᩵;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۜ᩵;

    iput v0, v1, Ll/֡ۜ᩵;->֫:I

    return-void
.end method

.method public static final ܽ()I
    .locals 6

    .line 126
    sget-object v0, Ll/ۚۜ᩵;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ۜ᩵;

    iget v1, v1, Ll/֡ۜ᩵;->ۧ:I

    if-eqz v1, :cond_0

    shl-int/lit8 v2, v1, 0xd

    xor-int/2addr v1, v2

    ushr-int/lit8 v2, v1, 0x11

    xor-int/2addr v1, v2

    shl-int/lit8 v2, v1, 0x5

    xor-int/2addr v1, v2

    goto :goto_0

    .line 103
    :cond_0
    sget-object v1, Ll/ۚۜ᩵;->᩷:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v2, -0x4498517a7b3558c5L    # -1.5671250923562117E-22

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    move-result-wide v1

    const/16 v3, 0x21

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    const-wide v4, -0xae502812aa7333L

    mul-long v1, v1, v4

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    const-wide v3, -0x3b314601e57a13adL    # -2.902039044684214E23

    mul-long v1, v1, v3

    const/16 v3, 0x20

    ushr-long/2addr v1, v3

    long-to-int v1, v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 130
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۜ᩵;

    iput v1, v0, Ll/֡ۜ᩵;->ۧ:I

    return v1
.end method
