.class public final synthetic Ll/ᩳܺᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۜܺᩳ;

.field public final synthetic ۧ:Ljava/lang/reflect/Method;

.field public final synthetic ܽ:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺᩳ;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܺᩳ;->֫:Ll/ۜܺᩳ;

    iput-object p2, p0, Ll/ᩳܺᩳ;->ۧ:Ljava/lang/reflect/Method;

    iput-object p3, p0, Ll/ᩳܺᩳ;->ܽ:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 713
    iget-object v0, p0, Ll/ᩳܺᩳ;->֫:Ll/ۜܺᩳ;

    iget-object v0, v0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    new-instance v1, Ll/ܳܺᩳ;

    iget-object v2, p0, Ll/ᩳܺᩳ;->ۧ:Ljava/lang/reflect/Method;

    iget-object v3, p0, Ll/ᩳܺᩳ;->ܽ:[Ljava/lang/Object;

    invoke-direct {v1, v2, v3}, Ll/ܳܺᩳ;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
