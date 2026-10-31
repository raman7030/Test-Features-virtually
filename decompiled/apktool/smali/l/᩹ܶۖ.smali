.class public final Ll/᩹ܶۖ;
.super Ljava/lang/Object;
.source "S50A"

# interfaces
.implements Ll/ܺܶۖ;


# instance fields
.field public final synthetic ֫:Ljava/util/zip/ZipOutputStream;


# direct methods
.method public constructor <init>(Ljava/util/zip/ZipOutputStream;)V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܶۖ;->֫:Ljava/util/zip/ZipOutputStream;

    return-void
.end method


# virtual methods
.method public final create()Ll/᩻᩶ۚ;
    .locals 3

    .line 118
    new-instance v0, Ll/ۜ᩶ۚ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۜ᩶ۚ;-><init>(I)V

    .line 119
    new-instance v1, Ll/ۨܶۖ;

    invoke-direct {v1, v0}, Ll/ۨܶۖ;-><init>(Ll/ۜ᩶ۚ;)V

    .line 120
    new-instance v2, Ll/᩸ܶۖ;

    invoke-direct {v2, p0, v1, v1, v0}, Ll/᩸ܶۖ;-><init>(Ll/᩹ܶۖ;Ll/ۨܶۖ;Ll/ۨܶۖ;Ll/ۜ᩶ۚ;)V

    return-object v2
.end method
