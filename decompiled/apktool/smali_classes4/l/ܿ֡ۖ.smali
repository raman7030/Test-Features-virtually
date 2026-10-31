.class public final Ll/ܿ֡ۖ;
.super Ljava/lang/Object;
.source "49PB"


# static fields
.field public static final ֫:Ll/ۧ֡ۖ;

.field public static final ۧ:Ll/ᩳ֡ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 25
    :try_start_0
    const-class v1, Ll/ܽ֡ۖ;

    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֡ۖ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 12
    :catch_0
    sput-object v0, Ll/ܿ֡ۖ;->֫:Ll/ۧ֡ۖ;

    .line 13
    new-instance v0, Ll/ᩳ֡ۖ;

    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    sput-object v0, Ll/ܿ֡ۖ;->ۧ:Ll/ᩳ֡ۖ;

    return-void
.end method

.method public static ֫()Ll/ۧ֡ۖ;
    .locals 1

    .line 16
    sget-object v0, Ll/ܿ֡ۖ;->֫:Ll/ۧ֡ۖ;

    return-object v0
.end method

.method public static ۧ()Ll/ᩳ֡ۖ;
    .locals 1

    .line 20
    sget-object v0, Ll/ܿ֡ۖ;->ۧ:Ll/ᩳ֡ۖ;

    return-object v0
.end method
