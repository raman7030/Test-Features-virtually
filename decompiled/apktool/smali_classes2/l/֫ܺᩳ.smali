.class public final synthetic Ll/֫ܺᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ll/ۢܺᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۜܺᩳ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܺᩳ;->֫:Ll/ۜܺᩳ;

    iput-object p2, p0, Ll/֫ܺᩳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/֫ܺᩳ;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 859
    iget-object v0, p0, Ll/֫ܺᩳ;->֫:Ll/ۜܺᩳ;

    iget-object v1, v0, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    new-instance v2, Ll/᩺ۡᩳ;

    iget-object v3, p0, Ll/֫ܺᩳ;->ۧ:Ljava/lang/String;

    iget-object v4, p0, Ll/֫ܺᩳ;->ܽ:Ljava/lang/String;

    invoke-direct {v2, v0, v3, v4}, Ll/᩺ۡᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
