.class public final Ll/ۘ᩸ۖ;
.super Ll/᩵᩹ۖ;
.source "V5IR"


# instance fields
.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۘ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    const v0, 0x303335

    .line 28
    iput v0, p0, Ll/ۘ᩸ۖ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/ܽ᩸ۖ;
    .locals 1

    .line 38
    new-instance v0, Ll/ܽ᩸ۖ;

    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput p4, v0, Ll/ܽ᩸ۖ;->᩸:I

    .line 56
    iput-object p1, v0, Ll/ܽ᩸ۖ;->᩶:Ljava/lang/String;

    .line 57
    iput-object p2, v0, Ll/ܽ᩸ۖ;->ۤ:Ljava/lang/String;

    .line 58
    iput-object p3, v0, Ll/ܽ᩸ۖ;->ۗ:[Ljava/lang/String;

    .line 39
    iget-object p1, p0, Ll/ۘ᩸ۖ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final ֫(I)V
    .locals 0

    .line 32
    iput p1, p0, Ll/ۘ᩸ۖ;->ܽ:I

    .line 33
    invoke-super {p0, p1}, Ll/᩵᩹ۖ;->֫(I)V

    return-void
.end method
