.class public final Ll/۫ܳۢ;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Ll/ۧۛܽ;


# instance fields
.field public final synthetic ֫:Ll/۟ܳۢ;

.field public final synthetic ۧ:Ll/ۗܺ᩷;

.field public final synthetic ܽ:Ll/ܶ᩵ܿ;

.field public final synthetic ᩳ:Ll/ܶ᩵ܿ;


# direct methods
.method public constructor <init>(Ll/۟ܳۢ;Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 910
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܳۢ;->֫:Ll/۟ܳۢ;

    iput-object p2, p0, Ll/۫ܳۢ;->ܽ:Ll/ܶ᩵ܿ;

    iput-object p3, p0, Ll/۫ܳۢ;->ᩳ:Ll/ܶ᩵ܿ;

    iput-object p4, p0, Ll/۫ܳۢ;->ۧ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܶ᩵ܿ;
    .locals 1

    .line 918
    iget-object v0, p0, Ll/۫ܳۢ;->ᩳ:Ll/ܶ᩵ܿ;

    return-object v0
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 6

    .line 933
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v3

    .line 939
    iget-object v1, p0, Ll/۫ܳۢ;->֫:Ll/۟ܳۢ;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ll/ۗܺ᩷;

    .line 940
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 941
    new-instance p1, Ll/ۛܳۢ;

    const/4 v5, 0x1

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Ll/ۛܳۢ;-><init>(Ll/۟ܳۢ;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/util/ArrayList;Z)V

    .line 1003
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public final ۧ()Ll/ۗܺ᩷;
    .locals 1

    .line 928
    iget-object v0, p0, Ll/۫ܳۢ;->ۧ:Ll/ۗܺ᩷;

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    const-string v0, "Dex2Smali"

    return-object v0
.end method

.method public final ᩳ()Ll/ܶ᩵ܿ;
    .locals 1

    .line 913
    iget-object v0, p0, Ll/۫ܳۢ;->ܽ:Ll/ܶ᩵ܿ;

    return-object v0
.end method
