.class public final Ll/ᩳۜۜ;
.super Ljava/lang/Object;
.source "079R"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 692
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 693
    iput-object p1, p0, Ll/ᩳۜۜ;->ᩳ:Ljava/lang/String;

    .line 694
    iput-object p2, p0, Ll/ᩳۜۜ;->ۧ:Ljava/lang/String;

    .line 695
    iput-object p3, p0, Ll/ᩳۜۜ;->֫:Ljava/lang/String;

    .line 696
    iput-object p4, p0, Ll/ᩳۜۜ;->ܿ:Ljava/lang/String;

    .line 697
    iput-object p5, p0, Ll/ᩳۜۜ;->ܽ:Ljava/lang/String;

    .line 698
    iput-object p6, p0, Ll/ᩳۜۜ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 712
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "axml"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 733
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const-string v1, "dex_field_smali"

    const/4 v2, 0x0

    move-object v0, v7

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 719
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "dex_class_smali"

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 726
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "dex_method_smali"

    const/4 v2, 0x0

    move-object v0, v7

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ܽ(Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 705
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-string v1, "entry_text"

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ᩳ(Ljava/lang/String;)Ll/ᩳۜۜ;
    .locals 8

    .line 740
    new-instance v7, Ll/ᩳۜۜ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v1, "resource_item"

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Ll/ᩳۜۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 4

    .line 747
    iget-object v0, p0, Ll/ᩳۜۜ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, " "

    .line 750
    iget-object v1, p0, Ll/ᩳۜۜ;->ܿ:Ljava/lang/String;

    iget-object v2, p0, Ll/ᩳۜۜ;->֫:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 751
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 753
    :cond_1
    iget-object v1, p0, Ll/ᩳۜۜ;->ܽ:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 754
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 756
    :cond_2
    iget-object v0, p0, Ll/ᩳۜۜ;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    return-object v2
.end method
