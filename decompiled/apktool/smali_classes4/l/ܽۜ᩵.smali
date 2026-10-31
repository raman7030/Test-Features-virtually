.class public final Ll/ܽۜ᩵;
.super Ljava/lang/Object;
.source "H6Q8"


# static fields
.field public static final ֫:J

.field public static final ۧ:Lsun/misc/Unsafe;

.field public static final ܽ:Ll/ܽ᩻᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 2609
    new-instance v0, Ll/ܽ᩻᩵;

    invoke-direct {v0}, Ll/ܽ᩻᩵;-><init>()V

    sput-object v0, Ll/ܽۜ᩵;->ܽ:Ll/ܽ᩻᩵;

    .line 2625
    sget-object v0, Ll/֨ۜ᩵;->֫:Lsun/misc/Unsafe;

    sput-object v0, Ll/ܽۜ᩵;->ۧ:Lsun/misc/Unsafe;

    .line 2629
    :try_start_0
    const-class v1, Ll/ܽ᩻᩵;

    const-string v2, "\u05ab"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    sput-wide v0, Ll/ܽۜ᩵;->֫:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 2631
    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ֫()V
    .locals 5

    .line 2618
    sget-object v0, Ll/ܽۜ᩵;->ۧ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ܽۜ᩵;->֫:J

    const/4 v3, 0x0

    sget-object v4, Ll/ܽۜ᩵;->ܽ:Ll/ܽ᩻᩵;

    invoke-virtual {v0, v4, v1, v2, v3}, Lsun/misc/Unsafe;->putIntVolatile(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static ۧ()V
    .locals 5

    .line 2615
    sget-object v0, Ll/ܽۜ᩵;->ۧ:Lsun/misc/Unsafe;

    sget-wide v1, Ll/ܽۜ᩵;->֫:J

    const/4 v3, 0x0

    sget-object v4, Ll/ܽۜ᩵;->ܽ:Ll/ܽ᩻᩵;

    invoke-virtual {v0, v4, v1, v2, v3}, Lsun/misc/Unsafe;->putOrderedInt(Ljava/lang/Object;JI)V

    return-void
.end method
