.class public final enum Ll/ᩴܺ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V
    .locals 10

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 509
    invoke-direct/range {v0 .. v9}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V
    .locals 9

    const-string v4, "opt.arg.flag"

    const-string v5, "opt.J"

    const-string v1, "J"

    const/16 v2, 0x30

    const-string v3, "-J"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    .line 0
    invoke-direct/range {v0 .. v8}, Ll/ᩴܺ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;Ll/ۢۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;)V
    .locals 0

    .line 512
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "the -J flag should be caught by the launcher."

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
