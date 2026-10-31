.class public final enum Ll/᩷ۖ۠;
.super Ll/֡ۖ۠;
.source "H7RN"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    .line 262
    invoke-direct/range {v0 .. v8}, Ll/֡ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ᩴۖ۠;Ll/ۘۖ۠;)V
    .locals 8

    const-string v4, "opt.arg.path"

    const-string v5, "opt.bootclasspath"

    const-string v1, "XBOOTCLASSPATH"

    const/16 v2, 0x15

    const-string v3, "-Xbootclasspath:"

    move-object v0, p0

    move-object v6, p1

    move-object v7, p2

    .line 0
    invoke-direct/range {v0 .. v7}, Ll/᩷ۖ۠;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ᩴۖ۠;Ll/ۘۖ۠;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const-string p2, "-Xbootclasspath/p:"

    .line 265
    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->ۧ(Ljava/lang/String;)V

    const-string p2, "-Xbootclasspath/a:"

    .line 266
    invoke-virtual {p1, p2}, Ll/֨ۖ۠;->ۧ(Ljava/lang/String;)V

    const-string p2, "-bootclasspath"

    .line 267
    invoke-super {p0, p1, p2, p3}, Ll/֡ۖ۠;->֫(Ll/֨ۖ۠;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
