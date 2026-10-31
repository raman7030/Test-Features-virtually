.class public final synthetic Ll/ܳܺᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ll/ۢܺᩳ;


# instance fields
.field public final synthetic ֫:Ljava/lang/reflect/Method;

.field public final synthetic ۧ:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳܺᩳ;->֫:Ljava/lang/reflect/Method;

    iput-object p2, p0, Ll/ܳܺᩳ;->ۧ:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ܳܺᩳ;->ۧ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 713
    iget-object v2, p0, Ll/ܳܺᩳ;->֫:Ljava/lang/reflect/Method;

    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
