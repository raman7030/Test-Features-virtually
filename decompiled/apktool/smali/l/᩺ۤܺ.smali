.class public final Ll/᩺ۤܺ;
.super Ll/ۤۤܺ;
.source "X4TD"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ᩸:Ll/ۤۤܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 707
    new-instance v0, Ll/᩺ۤܺ;

    .line 706
    invoke-direct {v0}, Ll/ۤۤܺ;-><init>()V

    .line 707
    sput-object v0, Ll/᩺ۤܺ;->᩸:Ll/ۤۤܺ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    .line 706
    check-cast p1, Ll/ܰۤܺ;

    check-cast p2, Ll/ܰۤܺ;

    .line 711
    invoke-static {}, Ll/ۜۗܺ;->ܿ()Ll/ۜۗܺ;

    move-result-object v0

    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v2, p2, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 712
    invoke-virtual {v0, v1, v2}, Ll/ۜۗܺ;->֫(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ll/ۜۗܺ;

    move-result-object v0

    iget-object p1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object p2, p2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 713
    invoke-virtual {v0, p1, p2}, Ll/ۜۗܺ;->֫(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ll/ۜۗܺ;

    move-result-object p1

    .line 714
    invoke-virtual {p1}, Ll/ۜۗܺ;->֫()I

    move-result p1

    return p1
.end method
