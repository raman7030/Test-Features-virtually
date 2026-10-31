.class public final Ll/ᩴ᩸ۖ;
.super Ljava/lang/Object;
.source "H528"

# interfaces
.implements Ll/ᩴ᩹ۖ;


# instance fields
.field public final synthetic ᩸:Ll/᩵᩸ۖ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/᩵᩸ۖ;I)V
    .locals 0

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩸ۖ;->᩸:Ll/᩵᩸ۖ;

    iput p2, p0, Ll/ᩴ᩸ۖ;->᩹:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/ܽܶۖ;)Ll/ۧ᩸ۖ;
    .locals 4

    .line 119
    iget-object v0, p0, Ll/ᩴ᩸ۖ;->᩸:Ll/᩵᩸ۖ;

    iget-object v1, v0, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    iget v2, p0, Ll/ᩴ᩸ۖ;->᩹:I

    aget-object v1, v1, v2

    if-nez v1, :cond_0

    .line 121
    new-instance v1, Ljava/util/ArrayList;

    const/4 v3, 0x5

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    iget-object v0, v0, Ll/᩵᩸ۖ;->ۗ:[Ljava/util/List;

    aput-object v1, v0, v2

    .line 124
    :cond_0
    new-instance v0, Ll/ۧ᩸ۖ;

    invoke-direct {v0, p1, p2}, Ll/ۧ᩸ۖ;-><init>(Ljava/lang/String;Ll/ܽܶۖ;)V

    .line 125
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
