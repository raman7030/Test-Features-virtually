.class public final Ll/ᩴ۬᩷;
.super Ljava/lang/Object;
.source "VB8B"


# instance fields
.field public final ֫:Ll/ۛ᩵᩷;


# direct methods
.method public constructor <init>(Ll/ۛ᩵᩷;)V
    .locals 1

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "project_export_init_path"

    .line 1620
    invoke-virtual {p1, v0}, Ll/ܶ᩵᩷;->֫(Ljava/lang/String;)V

    .line 58
    iput-object p1, p0, Ll/ᩴ۬᩷;->֫:Ll/ۛ᩵᩷;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)V
    .locals 6

    .line 62
    iget-object v0, p0, Ll/ᩴ۬᩷;->֫:Ll/ۛ᩵᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    const/16 v5, 0x18

    const v1, 0x7f1205d5

    const/4 v2, 0x0

    move-object v3, p1

    .line 0
    invoke-static/range {v0 .. v5}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    return-void
.end method
