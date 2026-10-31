.class public final Ll/ᩴۡ᩻;
.super Ljava/lang/Object;
.source "TAIM"

# interfaces
.implements Ll/᩹᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۡ᩻;

.field public final synthetic ᩹:Ll/᩷۫ܳ;


# direct methods
.method public constructor <init>(Ll/᩵ۡ᩻;Ll/᩷۫ܳ;)V
    .locals 0

    .line 777
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۡ᩻;->᩸:Ll/᩵ۡ᩻;

    iput-object p2, p0, Ll/ᩴۡ᩻;->᩹:Ll/᩷۫ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJJ)V
    .locals 0

    .line 780
    iget-object p3, p0, Ll/ᩴۡ᩻;->᩹:Ll/᩷۫ܳ;

    invoke-virtual {p3, p1, p2}, Ll/᩷۫ܳ;->֫(J)V

    .line 781
    iget-object p1, p0, Ll/ᩴۡ᩻;->᩸:Ll/᩵ۡ᩻;

    iget-object p2, p1, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p2, p3}, Ll/֫۬ܿ;->֫(Ll/᩷۫ܳ;)V

    .line 782
    iget-object p2, p1, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p2, p7, p8}, Ll/֫۬ܿ;->֫(J)V

    .line 783
    iget-object p1, p1, Ll/᩵ۡ᩻;->ܳ:Ll/֫۬ܿ;

    invoke-virtual {p3}, Ll/᩷۫ܳ;->ܽ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/֫۬ܿ;->֫(I)V

    return-void
.end method

.method public final ܺ֫()Ll/ۙ֡ܿ;
    .locals 1

    .line 789
    iget-object v0, p0, Ll/ᩴۡ᩻;->᩸:Ll/᩵ۡ᩻;

    iget-object v0, v0, Ll/᩵ۡ᩻;->᩷:Ll/ۙ֡ܿ;

    return-object v0
.end method

.method public final synthetic ᩷֫()V
    .locals 0

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 794
    iget-object v0, p0, Ll/ᩴۡ᩻;->᩸:Ll/᩵ۡ᩻;

    invoke-virtual {v0}, Ll/᩵ۡ᩻;->ۜ()Z

    move-result v0

    return v0
.end method
