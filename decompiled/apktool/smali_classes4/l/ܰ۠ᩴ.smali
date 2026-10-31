.class public final synthetic Ll/ܰ۠ᩴ;
.super Ll/۫۠ᩴ;
.source "N673"


# instance fields
.field public final synthetic a:Ljava/nio/file/attribute/UserPrincipalLookupService;


# direct methods
.method public constructor <init>(Ljava/nio/file/attribute/UserPrincipalLookupService;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;)Ll/֨ܶᩴ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    invoke-virtual {v0, p1}, Ljava/nio/file/attribute/UserPrincipalLookupService;->lookupPrincipalByGroupName(Ljava/lang/String;)Ljava/nio/file/attribute/GroupPrincipal;

    move-result-object p1

    invoke-static {p1}, Ll/֨ܶᩴ;->a(Ljava/nio/file/attribute/GroupPrincipal;)Ll/֨ܶᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Ljava/lang/String;)Ll/ۨ۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    invoke-virtual {v0, p1}, Ljava/nio/file/attribute/UserPrincipalLookupService;->lookupPrincipalByName(Ljava/lang/String;)Ljava/nio/file/attribute/UserPrincipal;

    move-result-object p1

    invoke-static {p1}, Ll/᩶ܶᩴ;->a(Ljava/nio/file/attribute/UserPrincipal;)Ll/ۨ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    instance-of v1, p1, Ll/ܰ۠ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܰ۠ᩴ;

    iget-object p1, p1, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
