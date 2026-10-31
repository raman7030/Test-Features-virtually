.class public final Ll/۠ᩳ;
.super Ljava/lang/Object;
.source "TB8W"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۙ:Landroid/content/IntentSender;

.field public final ᩶:I

.field public final ᩸:Landroid/content/Intent;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 166
    new-instance v0, Ll/֨ᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۠ᩳ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V
    .locals 1

    const-string v0, "intentSender"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/۠ᩳ;->ۙ:Landroid/content/IntentSender;

    .line 41
    iput-object p2, p0, Ll/۠ᩳ;->᩸:Landroid/content/Intent;

    .line 45
    iput p3, p0, Ll/۠ᩳ;->᩹:I

    .line 49
    iput p4, p0, Ll/۠ᩳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Ll/۠ᩳ;->ۙ:Landroid/content/IntentSender;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 66
    iget-object v0, p0, Ll/۠ᩳ;->᩸:Landroid/content/Intent;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 67
    iget p2, p0, Ll/۠ᩳ;->᩹:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    iget p2, p0, Ll/۠ᩳ;->᩶:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public final ֫()Landroid/content/Intent;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۠ᩳ;->᩸:Landroid/content/Intent;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 45
    iget v0, p0, Ll/۠ᩳ;->᩹:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 49
    iget v0, p0, Ll/۠ᩳ;->᩶:I

    return v0
.end method

.method public final ᩳ()Landroid/content/IntentSender;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۠ᩳ;->ۙ:Landroid/content/IntentSender;

    return-object v0
.end method
