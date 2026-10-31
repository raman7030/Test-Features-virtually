.class public final Ll/ܳܶۧ;
.super Ll/ۛܶۧ;
.source "C682"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public ᩸:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 184
    new-instance v0, Ll/ܿܶۧ;

    .line 185
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 184
    sput-object v0, Ll/ܳܶۧ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Landroid/view/AbsSavedState;->EMPTY_STATE:Landroid/view/AbsSavedState;

    .line 2237
    invoke-direct {p0, v0}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 2233
    invoke-direct {p0, p1}, Landroid/view/AbsSavedState;-><init>(Landroid/os/Parcel;)V

    .line 201
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܳܶۧ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 210
    invoke-super {p0, p1, p2}, Landroid/view/AbsSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 211
    iget-object p2, p0, Ll/ܳܶۧ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
