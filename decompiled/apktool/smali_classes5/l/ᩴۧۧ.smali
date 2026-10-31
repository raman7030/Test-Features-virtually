.class public final synthetic Ll/ᩴۧۧ;
.super Ljava/lang/Object;
.source "Q8T9"

# interfaces
.implements Ll/᩻ۚ֫;


# instance fields
.field public final synthetic ۗ:Z

.field public final synthetic ۙ:Ljava/io/IOException;

.field public final synthetic ᩶:Ll/ۜۧۧ;

.field public final synthetic ᩸:Ll/۠ۧۧ;

.field public final synthetic ᩹:Ll/ۧۧۧ;


# direct methods
.method public synthetic constructor <init>(Ll/۠ۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۧۧ;->᩸:Ll/۠ۧۧ;

    iput-object p2, p0, Ll/ᩴۧۧ;->᩹:Ll/ۧۧۧ;

    iput-object p3, p0, Ll/ᩴۧۧ;->᩶:Ll/ۜۧۧ;

    iput-object p4, p0, Ll/ᩴۧۧ;->ۙ:Ljava/io/IOException;

    iput-boolean p5, p0, Ll/ᩴۧۧ;->ۗ:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 3
    move-object v0, p1

    check-cast v0, Ll/ܶۧۧ;

    .line 463
    iget-object p1, p0, Ll/ᩴۧۧ;->᩸:Ll/۠ۧۧ;

    iget v1, p1, Ll/۠ۧۧ;->ܽ:I

    iget-object v2, p1, Ll/۠ۧۧ;->ۧ:Ll/ܺۧۧ;

    iget-object v3, p0, Ll/ᩴۧۧ;->᩹:Ll/ۧۧۧ;

    iget-object v4, p0, Ll/ᩴۧۧ;->᩶:Ll/ۜۧۧ;

    iget-object v5, p0, Ll/ᩴۧۧ;->ۙ:Ljava/io/IOException;

    iget-boolean v6, p0, Ll/ᩴۧۧ;->ۗ:Z

    invoke-interface/range {v0 .. v6}, Ll/ܶۧۧ;->֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V

    return-void
.end method
