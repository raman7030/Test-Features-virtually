.class public final Ll/ۧܳۚ;
.super Ljava/lang/Object;
.source "22RS"

# interfaces
.implements Ll/ܺ֫ۚ;


# instance fields
.field public final ֫:Ll/ܺ֫ۚ;

.field public final synthetic ۧ:Ll/ܽܳۚ;


# direct methods
.method public constructor <init>(Ll/ܽܳۚ;Ll/ܺ֫ۚ;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܳۚ;->ۧ:Ll/ܽܳۚ;

    .line 233
    iput-object p2, p0, Ll/ۧܳۚ;->֫:Ll/ܺ֫ۚ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۠ۗ֡;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/ۧܳۚ;->֫:Ll/ܺ֫ۚ;

    invoke-interface {v0}, Ll/ܺ֫ۚ;->֫()Ll/۠ۗ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 3

    .line 239
    iget-object v0, p0, Ll/ۧܳۚ;->ۧ:Ll/ܽܳۚ;

    invoke-virtual {v0}, Ll/ܽܳۚ;->ᩳ()Ll/ᩳ᩻ۚ;

    move-result-object v0

    iget-object v1, p0, Ll/ۧܳۚ;->֫:Ll/ܺ֫ۚ;

    invoke-interface {v1}, Ll/ܺ֫ۚ;->ۧ()Ljava/util/Set;

    move-result-object v1

    .line 78
    new-instance v2, Ll/ۡ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ۡ᩻ۚ;-><init>(Ljava/util/Set;Ll/ᩳ᩻ۚ;)V

    return-object v2
.end method
