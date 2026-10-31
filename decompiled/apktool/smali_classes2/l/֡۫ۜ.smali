.class public final synthetic Ll/֡۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۤۤۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۤۤۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡۫ۜ;->᩸:Ll/ۤۤۜ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 2
    sget p1, Ll/ۤۤۜ;->᩻ܿ:I

    .line 999
    iget-object p1, p0, Ll/֡۫ۜ;->᩸:Ll/ۤۤۜ;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
