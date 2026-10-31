.class public final Ll/ۧ֨ۚ;
.super Ljava/lang/Object;
.source "64JA"


# instance fields
.field public ֫:Ll/۟ۚۚ;

.field public ۧ:Ll/֫֨ۚ;

.field public ܽ:Z

.field public ᩳ:Ll/֡ܶۚ;


# direct methods
.method public constructor <init>(Ll/֡ܶۚ;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ll/ۧ֨ۚ;->ܽ:Z

    .line 26
    iput-object p1, p0, Ll/ۧ֨ۚ;->ᩳ:Ll/֡ܶۚ;

    .line 27
    invoke-virtual {p1}, Ll/֡ܶۚ;->ۧ()Ll/֫֨ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ֨ۚ;->ۧ:Ll/֫֨ۚ;

    .line 38
    new-instance p1, Ll/۟ۚۚ;

    .line 16
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    iput-object p1, p0, Ll/ۧ֨ۚ;->֫:Ll/۟ۚۚ;

    return-void
.end method

.method public static ܳ()Ll/ۧ֨ۚ;
    .locals 2

    .line 259
    new-instance v0, Ll/ۧ֨ۚ;

    new-instance v1, Ll/֨ܶۚ;

    .line 26
    invoke-direct {v1}, Ll/֡ܶۚ;-><init>()V

    .line 259
    invoke-direct {v0, v1}, Ll/ۧ֨ۚ;-><init>(Ll/֡ܶۚ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/᩶֡ۚ;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۧ֨ۚ;->ᩳ:Ll/֡ܶۚ;

    invoke-virtual {v0, p1, p2, p3, p0}, Ll/֡ܶۚ;->֫(Ljava/lang/String;Ll/᩶֡ۚ;Ljava/lang/String;Ll/ۧ֨ۚ;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ll/֨֡ۚ;
    .locals 1

    .line 47
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 60
    iget-object p1, p0, Ll/ۧ֨ۚ;->ᩳ:Ll/֡ܶۚ;

    invoke-virtual {p1, v0, p2, p0}, Ll/֡ܶۚ;->֫(Ljava/io/StringReader;Ljava/lang/String;Ll/ۧ֨ۚ;)V

    .line 61
    invoke-virtual {p1}, Ll/֡ܶۚ;->ܽ()V

    .line 64
    iget-object p2, p1, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    invoke-virtual {p2}, Ll/ᩳۚۚ;->ۧ()V

    const/4 p2, 0x0

    .line 65
    iput-object p2, p1, Ll/֡ܶۚ;->ܳ:Ll/ᩳۚۚ;

    .line 66
    iput-object p2, p1, Ll/֡ܶۚ;->ۡ:Ll/᩵֨ۚ;

    .line 67
    iput-object p2, p1, Ll/֡ܶۚ;->᩷:Ljava/util/ArrayList;

    .line 68
    iput-object p2, p1, Ll/֡ܶۚ;->᩻:Ljava/util/HashMap;

    .line 70
    iget-object p1, p1, Ll/֡ܶۚ;->ܽ:Ll/֨֡ۚ;

    return-object p1
.end method

.method public final ֫()Ll/۟ۚۚ;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۧ֨ۚ;->֫:Ll/۟ۚۚ;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Z
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۧ֨ۚ;->ᩳ:Ll/֡ܶۚ;

    .line 147
    invoke-virtual {v0, p1}, Ll/֡ܶۚ;->ۧ(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ۧ֨ۚ;->֫:Ll/۟ۚۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Ll/ۧ֨ۚ;->ܽ:Z

    return v0
.end method

.method public final ܿ()Ll/֫֨ۚ;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۧ֨ۚ;->ۧ:Ll/֫֨ۚ;

    return-object v0
.end method

.method public final ܿ()V
    .locals 1

    sget-object v0, Ll/֫֨ۚ;->ᩳ:Ll/֫֨ۚ;

    .line 130
    iput-object v0, p0, Ll/ۧ֨ۚ;->ۧ:Ll/֫֨ۚ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Ll/ۧ֨ۚ;->ܽ:Z

    return-void
.end method
