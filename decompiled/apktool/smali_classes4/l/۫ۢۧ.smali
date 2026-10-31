.class public final Ll/۫ۢۧ;
.super Ljava/lang/Object;
.source "V8J3"

# interfaces
.implements Ll/᩶ۢۧ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput p1, p0, Ll/۫ۢۧ;->ۧ:I

    .line 43
    iput p2, p0, Ll/۫ۢۧ;->֫:I

    .line 44
    iput p3, p0, Ll/۫ۢۧ;->ܽ:I

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/۫ۢۧ;
    .locals 4

    .line 26
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v0

    const/16 v1, 0x8

    .line 27
    invoke-virtual {p0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 28
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v1

    .line 29
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    move-result v2

    const/4 v3, 0x4

    .line 30
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 31
    invoke-virtual {p0}, Ll/ᩳ֨֫;->᩷()I

    const/16 v3, 0xc

    .line 32
    invoke-virtual {p0, v3}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 33
    new-instance p0, Ll/۫ۢۧ;

    invoke-direct {p0, v0, v1, v2}, Ll/۫ۢۧ;-><init>(III)V

    return-object p0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    const v0, 0x68697661

    return v0
.end method
