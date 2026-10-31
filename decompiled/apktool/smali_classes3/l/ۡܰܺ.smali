.class public final Ll/ۡܰܺ;
.super Ll/ܳܰܺ;
.source "O7SL"


# static fields
.field public static final ֫:J

.field public static final ۧ:Lsun/misc/Unsafe;

.field public static final ܳ:J

.field public static final ܽ:J

.field public static final ܿ:J

.field public static final ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 588
    const-class v0, Ll/ܺܰܺ;

    .line 590
    :try_start_0
    invoke-static {}, Lsun/misc/Unsafe;->getUnsafe()Lsun/misc/Unsafe;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 593
    :catch_0
    :try_start_1
    new-instance v1, Ll/ۢܰܺ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 594
    invoke-static {v1}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsun/misc/Unsafe;
    :try_end_1
    .catch Ljava/security/PrivilegedActionException; {:try_start_1 .. :try_end_1} :catch_2

    .line 612
    :goto_0
    :try_start_2
    const-class v2, Ll/ۖܰܺ;

    const-string v3, "\u1a76"

    .line 614
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/ۡܰܺ;->ᩳ:J

    const-string v3, "\u1a78"

    .line 616
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v3

    sput-wide v3, Ll/ۡܰܺ;->֫:J

    const-string v3, "\u1a79"

    .line 617
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ۡܰܺ;->ܽ:J

    const-string v2, "\u06e7"

    .line 618
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ۡܰܺ;->ܳ:J

    const-string v2, "\u05ab"

    .line 619
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v1, v0}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v2

    sput-wide v2, Ll/ۡܰܺ;->ܿ:J

    .line 620
    sput-object v1, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 622
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    .line 608
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Could not initialize intrinsics"

    invoke-virtual {v0}, Ljava/security/PrivilegedActionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static synthetic ֫()Lsun/misc/Unsafe;
    .locals 1

    .line 0
    invoke-static {}, Ll/ۡܰܺ;->ۧ()Lsun/misc/Unsafe;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ۧ()Lsun/misc/Unsafe;
    .locals 6

    .line 597
    const-class v0, Lsun/misc/Unsafe;

    .line 598
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    const/4 v5, 0x1

    .line 599
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/4 v5, 0x0

    .line 600
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 601
    invoke-virtual {v0, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 602
    invoke-virtual {v0, v4}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;

    return-object v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 605
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldError;

    const-string v1, "the Unsafe"

    invoke-direct {v0, v1}, Ljava/lang/NoSuchFieldError;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫(Ll/ۖܰܺ;Ll/ۧܰܺ;)Ll/ۧܰܺ;
    .locals 2

    .line 651
    :cond_0
    iget-object v0, p1, Ll/ۖܰܺ;->᩸:Ll/ۧܰܺ;

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 655
    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Ll/ۡܰܺ;->֫(Ll/ۖܰܺ;Ll/ۧܰܺ;Ll/ۧܰܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0
.end method

.method public final ֫(Ll/ۖܰܺ;)Ll/ܺܰܺ;
    .locals 3

    .line 2
    sget-object v0, Ll/ܺܰܺ;->ܽ:Ll/ܺܰܺ;

    .line 664
    :cond_0
    iget-object v1, p1, Ll/ۖܰܺ;->᩶:Ll/ܺܰܺ;

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 668
    :cond_1
    invoke-virtual {p0, p1, v1, v0}, Ll/ۡܰܺ;->֫(Ll/ۖܰܺ;Ll/ܺܰܺ;Ll/ܺܰܺ;)Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v1
.end method

.method public final ֫(Ll/ܺܰܺ;Ljava/lang/Thread;)V
    .locals 3

    .line 628
    sget-object v0, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۡܰܺ;->ܳ:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ܺܰܺ;Ll/ܺܰܺ;)V
    .locals 3

    .line 633
    sget-object v0, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ۡܰܺ;->ܿ:J

    invoke-virtual {v0, p1, v1, v2, p2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    .line 676
    sget-object v0, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡܰܺ;->ܽ:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/᩷ܰܺ;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۖܰܺ;Ll/ۧܰܺ;Ll/ۧܰܺ;)Z
    .locals 6

    .line 645
    sget-object v0, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡܰܺ;->֫:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/᩷ܰܺ;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۖܰܺ;Ll/ܺܰܺ;Ll/ܺܰܺ;)Z
    .locals 6

    .line 639
    sget-object v0, Ll/ۡܰܺ;->ۧ:Lsun/misc/Unsafe;

    sget-wide v2, Ll/ۡܰܺ;->ᩳ:J

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v0 .. v5}, Ll/᩷ܰܺ;->֫(Lsun/misc/Unsafe;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
