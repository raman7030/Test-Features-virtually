.class public final synthetic Ll/ۖܶᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/attribute/FileAttributeView;


# instance fields
.field public final synthetic a:Ll/᩶۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩶۠ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    instance-of v1, p1, Ll/ۖܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۖܶᩴ;

    iget-object p1, p1, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    invoke-interface {v0}, Ll/᩺۠ᩴ;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
