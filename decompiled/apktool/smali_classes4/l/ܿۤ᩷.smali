.class public final synthetic Ll/ܿۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۬:Z

.field public final synthetic ᩶:Ljava/util/ArrayList;

.field public final synthetic ᩸:Ll/ܿۛ᩷;

.field public final synthetic ᩹:[Z


# direct methods
.method public synthetic constructor <init>(Ll/ܿۛ᩷;[ZLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿۤ᩷;->᩸:Ll/ܿۛ᩷;

    iput-object p2, p0, Ll/ܿۤ᩷;->᩹:[Z

    iput-object p3, p0, Ll/ܿۤ᩷;->᩶:Ljava/util/ArrayList;

    iput-object p4, p0, Ll/ܿۤ᩷;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ܿۤ᩷;->ۗ:Ljava/lang/String;

    iput-boolean p6, p0, Ll/ܿۤ᩷;->۬:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 0
    iget-object v4, p0, Ll/ܿۤ᩷;->ۗ:Ljava/lang/String;

    iget-boolean v5, p0, Ll/ܿۤ᩷;->۬:Z

    iget-object v0, p0, Ll/ܿۤ᩷;->᩸:Ll/ܿۛ᩷;

    iget-object v1, p0, Ll/ܿۤ᩷;->᩹:[Z

    iget-object v2, p0, Ll/ܿۤ᩷;->᩶:Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܿۤ᩷;->ۙ:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Ll/ܿۛ᩷;->֫(Ll/ܿۛ᩷;[ZLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
