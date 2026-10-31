.class public final Ll/ܶۡ᩻;
.super Ljava/lang/Object;
.source "88AQ"

# interfaces
.implements Ll/᩵۬ܳ;


# instance fields
.field public final synthetic ᩸:Ll/ۙۡ᩻;

.field public final synthetic ᩹:Ll/᩹ۡ᩻;


# direct methods
.method public constructor <init>(Ll/ۙۡ᩻;Ll/᩹ۡ᩻;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۡ᩻;->᩸:Ll/ۙۡ᩻;

    iput-object p2, p0, Ll/ܶۡ᩻;->᩹:Ll/᩹ۡ᩻;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ܶۡ᩻;->᩹:Ll/᩹ۡ᩻;

    invoke-interface {v0}, Ll/֨ۡ᩻;->֫()V

    return-void
.end method

.method public final ۟()V
    .locals 2

    .line 135
    iget-object v0, p0, Ll/ܶۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {v0}, Ll/ۙۡ᩻;->ۧ(Ll/ۙۡ᩻;)Ll/ܶ۬ܳ;

    move-result-object v0

    iget-object v1, p0, Ll/ܶۡ᩻;->᩹:Ll/᩹ۡ᩻;

    invoke-interface {v1, v0}, Ll/֨ۡ᩻;->֫(Ll/᩷۫ܳ;)V

    return-void
.end method

.method public final synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ܶۡ᩻;->᩹:Ll/᩹ۡ᩻;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    return v0
.end method
