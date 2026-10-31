.class public final Ll/᩺֡ۜ;
.super Ljava/lang/Object;
.source "Q8FL"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ll/ܽۚۜ;

.field public final ܽ:Ll/ᩳۜܳ;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܽۚۜ;Ll/ᩳۜܳ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1544
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1545
    iput-object p1, p0, Ll/᩺֡ۜ;->ۧ:Ll/ܽۚۜ;

    .line 1546
    iput-object p2, p0, Ll/᩺֡ۜ;->ܽ:Ll/ᩳۜܳ;

    .line 1547
    iput-object p3, p0, Ll/᩺֡ۜ;->֫:Ljava/lang/String;

    .line 1548
    iput-object p4, p0, Ll/᩺֡ۜ;->ᩳ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺֡ۜ;)Ll/ᩳۜܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺֡ۜ;->ܽ:Ll/ᩳۜܳ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 1572
    iget-object v0, p0, Ll/᩺֡ۜ;->ᩳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ll/ܰ֡ۜ;
    .locals 3

    .line 1556
    iget-object v0, p0, Ll/᩺֡ۜ;->ܽ:Ll/ᩳۜܳ;

    iget-object v1, p0, Ll/᩺֡ۜ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/᩺֡ۜ;->ۧ:Ll/ܽۚۜ;

    invoke-virtual {v2, v0, v1}, Ll/ܽۚۜ;->֫(Ll/ᩳۜܳ;Ljava/lang/String;)Ll/ܰ֡ۜ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/۟ܰۜ;
    .locals 3

    .line 1564
    iget-object v0, p0, Ll/᩺֡ۜ;->ܽ:Ll/ᩳۜܳ;

    iget-object v1, p0, Ll/᩺֡ۜ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/᩺֡ۜ;->ۧ:Ll/ܽۚۜ;

    invoke-virtual {v2, v0, v1}, Ll/ܽۚۜ;->ۧ(Ll/ᩳۜܳ;Ljava/lang/String;)Ll/۟ܰۜ;

    move-result-object v0

    return-object v0
.end method
