.class public Ll/ۢ֫֨;
.super Ll/ۨܽ֨;
.source "C5BI"


# instance fields
.field public ᩻ۧ:Ll/۟۫ۚ;


# direct methods
.method public constructor <init>(Ll/۟۫ۚ;Ll/ۨܽ֨;)V
    .locals 0

    .line 153
    invoke-direct {p0, p2}, Ll/ۨܽ֨;-><init>(Ll/ۨܽ֨;)V

    .line 154
    iput-object p1, p0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    const-string p1, "AnnotationValue"

    .line 155
    iput-object p1, p0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 5

    .line 160
    iget-object v0, p0, Ll/ۨܽ֨;->֫ۧ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    invoke-virtual {v1}, Ll/۟۫ۚ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۢ֫֨;->᩹()Ljava/lang/String;

    move-result-object v2

    const-string v3, "<"

    const-string v4, " "

    .line 0
    invoke-static {v3, v0, v4, v1, v4}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-static {v0, v2, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۧ()V
    .locals 2

    .line 169
    iget-object v0, p0, Ll/ۢ֫֨;->᩻ۧ:Ll/۟۫ۚ;

    invoke-virtual {v0}, Ll/۟۫ۚ;->ܿ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0}, Ll/ۢܽ֨;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public ᩹()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method
