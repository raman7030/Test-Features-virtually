.class public Ll/֡֨ܽ;
.super Ll/ۛۚܽ;
.source "Z6QT"


# instance fields
.field public ۧ:I


# direct methods
.method public constructor <init>(Ll/ۛۚܽ;)V
    .locals 1

    .line 750
    invoke-direct {p0}, Ll/ۛۚܽ;-><init>()V

    .line 751
    iput-object p1, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    .line 752
    new-instance p1, Ll/۬֨ܽ;

    invoke-direct {p1}, Ll/۬֨ܽ;-><init>()V

    .line 753
    iget-object v0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-virtual {v0, p1}, Ll/ۛۚܽ;->֫(Ll/۬֨ܽ;)Z

    .line 754
    iget p1, p1, Ll/۬֨ܽ;->ᩳ:I

    iput p1, p0, Ll/֡֨ܽ;->ۧ:I

    return-void
.end method
