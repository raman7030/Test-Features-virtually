.class public final Ll/֨ܰۜ;
.super Ljava/lang/Object;
.source "S6MQ"


# instance fields
.field public final ֫:Ll/ۛܰۜ;

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IIILl/ۛܰۜ;)V
    .locals 0

    .line 892
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 893
    iput p1, p0, Ll/֨ܰۜ;->ᩳ:I

    .line 894
    iput p2, p0, Ll/֨ܰۜ;->ۧ:I

    .line 895
    iput p3, p0, Ll/֨ܰۜ;->ܽ:I

    .line 896
    iput-object p4, p0, Ll/֨ܰۜ;->֫:Ll/ۛܰۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ܰۜ;)Z
    .locals 2

    .line 900
    iget v0, p0, Ll/֨ܰۜ;->ᩳ:I

    iget v1, p1, Ll/֡ܰۜ;->᩷:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/֨ܰۜ;->ۧ:I

    iget v1, p1, Ll/֡ܰۜ;->ۜ:I

    if-ne v0, v1, :cond_0

    iget-object p1, p1, Ll/֡ܰۜ;->ۢ:Ll/ۗۨۜ;

    .line 901
    check-cast p1, Ll/ܶ᩺ۜ;

    .line 828
    iget-object p1, p1, Ll/ܶ᩺ۜ;->ܺ:Ll/ܶۨۜ;

    iget p1, p1, Ll/ܶۨۜ;->ᩳ:I

    .line 901
    iget v0, p0, Ll/֨ܰۜ;->ܽ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
