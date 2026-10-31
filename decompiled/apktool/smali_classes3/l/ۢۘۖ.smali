.class public final Ll/ۢۘۖ;
.super Ljava/lang/Object;
.source "D9PX"


# static fields
.field public static final ֫:Ll/ܿۘۖ;

.field public static final ۧ:Ll/᩷ۘۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Ll/᩷ۘۖ;

    .line 18
    invoke-direct {v0}, Ll/ܿۘۖ;-><init>()V

    .line 12
    sput-object v0, Ll/ۢۘۖ;->ۧ:Ll/᩷ۘۖ;

    const/4 v0, 0x0

    .line 17
    :try_start_0
    const-class v1, Ll/᩻ۘۖ;

    sget v2, Ll/᩻ۘۖ;->֫:I

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿۘۖ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 13
    :catch_0
    sput-object v0, Ll/ۢۘۖ;->֫:Ll/ܿۘۖ;

    return-void
.end method

.method public static ֫()Ll/ܿۘۖ;
    .locals 2

    .line 29
    sget-object v0, Ll/ۢۘۖ;->֫:Ll/ܿۘۖ;

    if-eqz v0, :cond_0

    return-object v0

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Protobuf runtime is not correctly loaded."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۧ()Ll/᩷ۘۖ;
    .locals 1

    .line 25
    sget-object v0, Ll/ۢۘۖ;->ۧ:Ll/᩷ۘۖ;

    return-object v0
.end method
