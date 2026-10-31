.class public final synthetic Ll/ۙ۫᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ܿۛ᩷;

.field public final synthetic ᩹:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/ܿۛ᩷;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۫᩷;->᩸:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/ۙ۫᩷;->᩹:Ljava/util/List;

    iput-boolean p3, p0, Ll/ۙ۫᩷;->᩶:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 2
    sget p1, Ll/ܿۛ᩷;->ۛۧ:I

    .line 2170
    new-instance p1, Ll/ۜۤ᩷;

    iget-object p2, p0, Ll/ۙ۫᩷;->᩸:Ll/ܿۛ᩷;

    iget-object v0, p0, Ll/ۙ۫᩷;->᩹:Ljava/util/List;

    iget-boolean v1, p0, Ll/ۙ۫᩷;->᩶:Z

    invoke-direct {p1, p2, v0, v1}, Ll/ۜۤ᩷;-><init>(Ll/ܿۛ᩷;Ljava/util/List;Z)V

    .line 2200
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
