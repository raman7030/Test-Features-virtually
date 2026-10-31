.class public final synthetic Ll/۫ۗᩳ;
.super Ljava/lang/Object;
.source "I6U1"

# interfaces
.implements Ll/ۡ᩹ᩳ;


# instance fields
.field public final synthetic ֫:Ll/ܰ᩶ᩳ;

.field public final synthetic ۧ:Ll/᩻ۙᩳ;

.field public final synthetic ܽ:Ll/᩻ۙᩳ;

.field public final synthetic ᩳ:[Ll/ۚۗᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ᩶ᩳ;Ll/᩻ۙᩳ;Ll/᩻ۙᩳ;[Ll/ۚۗᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۗᩳ;->֫:Ll/ܰ᩶ᩳ;

    iput-object p2, p0, Ll/۫ۗᩳ;->ۧ:Ll/᩻ۙᩳ;

    iput-object p3, p0, Ll/۫ۗᩳ;->ܽ:Ll/᩻ۙᩳ;

    iput-object p4, p0, Ll/۫ۗᩳ;->ᩳ:[Ll/ۚۗᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(IILl/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;I)V
    .locals 7

    .line 477
    sget-object v0, Ll/ܰ᩶ᩳ;->᩶:Ll/ܰ᩶ᩳ;

    iget-object v1, p0, Ll/۫ۗᩳ;->֫:Ll/ܰ᩶ᩳ;

    if-ne v1, v0, :cond_1

    .line 478
    invoke-virtual {p3}, Ll/ۨ᩹ᩳ;->ۧ()I

    move-result p3

    if-ne p1, p3, :cond_0

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Loader may only append text"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 480
    :cond_1
    iget-object v0, p0, Ll/۫ۗᩳ;->ۧ:Ll/᩻ۙᩳ;

    if-eqz v0, :cond_2

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/᩻ۙᩳ;->֫(IILl/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;I)V

    .line 481
    :cond_2
    iget-object v1, p0, Ll/۫ۗᩳ;->ܽ:Ll/᩻ۙᩳ;

    if-eqz v1, :cond_3

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Ll/᩻ۙᩳ;->֫(IILl/ۨ᩹ᩳ;Ll/ۨ᩹ᩳ;I)V

    .line 482
    :cond_3
    iget-object p3, p0, Ll/۫ۗᩳ;->ᩳ:[Ll/ۚۗᩳ;

    const/4 p4, 0x0

    aget-object v0, p3, p4

    invoke-virtual {v0, p1, p2, p5}, Ll/ۚۗᩳ;->֫(III)Ll/ۚۗᩳ;

    move-result-object p1

    aput-object p1, p3, p4

    return-void
.end method
