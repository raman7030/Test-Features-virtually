.class public final synthetic Ll/۠۫ܺ;
.super Ljava/lang/Object;
.source "I5ZF"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:Ljava/util/Comparator;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۫ܺ;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    check-cast p1, Ll/ܶ۫ܺ;

    .line 4
    check-cast p2, Ll/ܶ۫ܺ;

    .line 1342
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    iget-object v1, p1, Ll/ܶ۫ܺ;->ۧ:Ll/ۛۤܺ;

    .line 1343
    check-cast v1, Ll/᩹۫ܺ;

    invoke-virtual {v1}, Ll/᩹۫ܺ;->peek()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p2, Ll/ܶ۫ܺ;->ۧ:Ll/ۛۤܺ;

    check-cast v2, Ll/᩹۫ܺ;

    invoke-virtual {v2}, Ll/᩹۫ܺ;->peek()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Ll/۠۫ܺ;->᩸:Ljava/util/Comparator;

    invoke-virtual {v0, v1, v2, v3}, Ll/ۜۗܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll/ۜۗܺ;

    move-result-object v0

    iget p1, p1, Ll/ܶ۫ܺ;->֫:I

    iget p2, p2, Ll/ܶ۫ܺ;->֫:I

    .line 1345
    invoke-virtual {v0, p1, p2}, Ll/ۜۗܺ;->֫(II)Ll/ۜۗܺ;

    move-result-object p1

    .line 1346
    invoke-virtual {p1}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method
