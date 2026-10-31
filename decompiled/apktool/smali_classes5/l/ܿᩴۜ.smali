.class public final synthetic Ll/ܿᩴۜ;
.super Ljava/lang/Object;
.source "D6X1"

# interfaces
.implements Ll/ۢۖۜ;


# instance fields
.field public final synthetic ۙ:[Ll/ۙܺۜ;

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:[Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/util/ArrayList;[Ll/ۙܺۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿᩴۜ;->᩸:Ljava/lang/String;

    iput-object p2, p0, Ll/ܿᩴۜ;->᩹:[Ljava/lang/String;

    iput-object p3, p0, Ll/ܿᩴۜ;->᩶:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/ܿᩴۜ;->ۙ:[Ll/ۙܺۜ;

    return-void
.end method


# virtual methods
.method public final synthetic ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V
    .locals 6

    .line 0
    iget-object v2, p0, Ll/ܿᩴۜ;->᩶:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܿᩴۜ;->ۙ:[Ll/ۙܺۜ;

    iget-object v0, p0, Ll/ܿᩴۜ;->᩸:Ljava/lang/String;

    iget-object v1, p0, Ll/ܿᩴۜ;->᩹:[Ljava/lang/String;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Ll/᩻ᩴۜ;->֫(Ljava/lang/String;[Ljava/lang/String;Ljava/util/ArrayList;[Ll/ۙܺۜ;Ll/ܶۖۜ;Ljava/io/BufferedOutputStream;)V

    return-void
.end method
