.class public final Ll/֨۟ܺ;
.super Ll/۠۟ܺ;
.source "XAXR"


# instance fields
.field public final ֫:Ll/۟۟ܺ;

.field public final ۧ:Ll/۠۟ܺ;

.field public final ܽ:Ll/۠۟ܺ;


# direct methods
.method public constructor <init>(Ll/۟۟ܺ;Ll/۠۟ܺ;Ll/۠۟ܺ;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ll/۠۟ܺ;-><init>()V

    .line 66
    iput-object p1, p0, Ll/֨۟ܺ;->֫:Ll/۟۟ܺ;

    .line 67
    iput-object p2, p0, Ll/֨۟ܺ;->ܽ:Ll/۠۟ܺ;

    .line 68
    iput-object p3, p0, Ll/֨۟ܺ;->ۧ:Ll/۠۟ܺ;

    return-void
.end method

.method public static ֫(Ll/۟۟ܺ;Ll/۠۟ܺ;Ll/۠۟ܺ;)Ll/֨۟ܺ;
    .locals 1

    .line 72
    new-instance v0, Ll/֨۟ܺ;

    invoke-direct {v0, p0, p1, p2}, Ll/֨۟ܺ;-><init>(Ll/۟۟ܺ;Ll/۠۟ܺ;Ll/۠۟ܺ;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 82
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "condition"

    iget-object v2, p0, Ll/֨۟ܺ;->֫:Ll/۟۟ܺ;

    .line 83
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "thenIndent"

    iget-object v2, p0, Ll/֨۟ܺ;->ܽ:Ll/۠۟ܺ;

    .line 84
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "elseIndent"

    iget-object v2, p0, Ll/֨۟ܺ;->ۧ:Ll/۠۟ܺ;

    .line 85
    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 2

    .line 77
    iget-object v0, p0, Ll/֨۟ܺ;->֫:Ll/۟۟ܺ;

    .line 44
    iget-object v0, v0, Ll/۟۟ܺ;->֫:Ll/ܽ۫ᩴ;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ll/ܽ۫ᩴ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Ll/֨۟ܺ;->ܽ:Ll/۠۟ܺ;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/֨۟ܺ;->ۧ:Ll/۠۟ܺ;

    :goto_0
    invoke-virtual {v0}, Ll/۠۟ܺ;->֫()I

    move-result v0

    return v0
.end method
