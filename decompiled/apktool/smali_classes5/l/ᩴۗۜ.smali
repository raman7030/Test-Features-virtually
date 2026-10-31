.class public final Ll/ᩴۗۜ;
.super Ljava/lang/Object;
.source "075F"

# interfaces
.implements Ll/ܶ۠֫;


# instance fields
.field public final ᩸:Ll/ܶ۠֫;

.field public final ᩹:Ll/ܶ۠֫;


# direct methods
.method public constructor <init>(Ll/ܶ۠֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ᩴۗۜ;->᩸:Ll/ܶ۠֫;

    if-nez p3, :cond_0

    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Ll/ۘۗۜ;

    invoke-direct {p1, p3, p2}, Ll/ۘۗۜ;-><init>(Ll/᩻۬ۜ;Ll/ܶ۠֫;)V

    move-object p2, p1

    :goto_0
    iput-object p2, p0, Ll/ᩴۗۜ;->᩹:Ll/ܶ۠֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۗۜ;)Ll/ܶ۠֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۗۜ;->᩸:Ll/ܶ۠֫;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۗۜ;)Ll/ܶ۠֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۗۜ;->᩹:Ll/ܶ۠֫;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/᩸۠֫;
    .locals 1

    .line 168
    new-instance v0, Ll/ۡۗۜ;

    invoke-direct {v0, p0}, Ll/ۡۗۜ;-><init>(Ll/ᩴۗۜ;)V

    return-object v0
.end method
