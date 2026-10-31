.class public final synthetic Ll/ۢܰۜ;
.super Ljava/lang/Object;
.source "76MD"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:D

.field public final synthetic ᩹:D


# direct methods
.method public synthetic constructor <init>(DD)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۢܰۜ;->᩸:D

    iput-wide p3, p0, Ll/ۢܰۜ;->᩹:D

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 0
    move-object v4, p1

    check-cast v4, Ll/ۡܰۜ;

    move-object v5, p2

    check-cast v5, Ll/ۡܰۜ;

    iget-wide v0, p0, Ll/ۢܰۜ;->᩸:D

    iget-wide v2, p0, Ll/ۢܰۜ;->᩹:D

    invoke-static/range {v0 .. v5}, Ll/ܺܰۜ;->֫(DDLl/ۡܰۜ;Ll/ۡܰۜ;)I

    move-result p1

    return p1
.end method
