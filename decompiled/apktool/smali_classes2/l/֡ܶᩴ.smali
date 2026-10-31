.class public final synthetic Ll/֡ܶᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩺۠ᩴ;


# instance fields
.field public final synthetic a:Ljava/nio/file/attribute/FileStoreAttributeView;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/attribute/FileStoreAttributeView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܶᩴ;->a:Ljava/nio/file/attribute/FileStoreAttributeView;

    return-void
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/֡ܶᩴ;->a:Ljava/nio/file/attribute/FileStoreAttributeView;

    instance-of v1, p1, Ll/֡ܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/֡ܶᩴ;

    iget-object p1, p1, Ll/֡ܶᩴ;->a:Ljava/nio/file/attribute/FileStoreAttributeView;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/֡ܶᩴ;->a:Ljava/nio/file/attribute/FileStoreAttributeView;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic name()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
